/*
 * Copyright 2013 EnergyOS.org
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.energyos.espi.thirdparty.web;

import org.energyos.espi.thirdparty.domain.Routes;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AuthorizationControllerTests {

    @Test
    public void authorization_fetchesToken() throws Exception {
        AuthorizationController controller = new AuthorizationController();
        RestTemplate restTemplate = mock(RestTemplate.class);
        controller.setTemplate(restTemplate);
        String code = "dC7BJ5";
        String url = String.format("http://localhost:8080/DataCustodian%s?redirect_uri=%s&code=%s&grant_type=authorization_code",
                Routes.AuthorizationServerTokenEndpoint, "http://localhost:8080/ThirdParty" + Routes.ThirdPartyOAuthCodeCallbackURL, code);

        controller.authorization(code);
        verify(restTemplate).getForObject(eq(url), eq(String.class));
    }
}