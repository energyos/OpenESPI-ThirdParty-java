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

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.08.27 at 01:43:57 PM EDT
//


package org.energyos.espi.thirdparty.domain;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


/**
 * Logical point on a network at which consumption or production is either physically measured (e.g., metered) or estimated (e.g., unmetered street lights).
 *
 * <p>Java class for UsagePoint complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="UsagePoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://naesb.org/espi}IdentifiedObject">
 *       &lt;sequence>
 *         &lt;element name="roleFlags" type="{http://naesb.org/espi}HexBinary16" minOccurs="0"/>
 *         &lt;element name="ServiceCategory" type="{http://naesb.org/espi}ServiceCategory" minOccurs="0"/>
 *         &lt;element name="status" type="{http://naesb.org/espi}UInt8" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlRootElement(name="UsagePoint")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsagePoint", propOrder = {
        "roleFlags",
        "serviceCategory",
        "status"
})
public class UsagePoint
        extends IdentifiedObject
{
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] roleFlags;

    @XmlElement(name = "ServiceCategory")
    protected ServiceCategory serviceCategory;

    protected Short status;

    @XmlTransient
    private List<MeterReading> meterReadings = new ArrayList<>();

    @XmlTransient
    private List<ElectricPowerUsageSummary> electricPowerUsageSummaries = new ArrayList<>();

    public void addMeterReading(MeterReading meterReading)
    {
        meterReadings.add(meterReading);
    }

    @XmlTransient
    protected RetailCustomer retailCustomer;

    /**
     * Gets the value of the roleFlags property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public byte[] getRoleFlags() {
        return roleFlags;
    }

    /**
     * Sets the value of the roleFlags property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRoleFlags(byte[] value) {
        this.roleFlags = value;
    }

    /**
     * Gets the value of the serviceCategory property.
     *
     * @return
     *     possible object is
     *     {@link ServiceCategory }
     *
     */
    public ServiceCategory getServiceCategory() {
        return serviceCategory;
    }

    /**
     * Sets the value of the serviceCategory property.
     *
     * @param value
     *     allowed object is
     *     {@link ServiceCategory }
     *
     */
    public void setServiceCategory(ServiceCategory value) {
        this.serviceCategory = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return
     *     possible object is
     *     {@link Short }
     *
     */
    public Short getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value
     *     allowed object is
     *     {@link Short }
     *
     */
    public void setStatus(Short value) {
        this.status = value;
    }

    public List<MeterReading> getMeterReadings() {
        return meterReadings;
    }

    public void setMeterReadings(List<MeterReading> meterReadings) {
        this.meterReadings = meterReadings;
    }

    public RetailCustomer getRetailCustomer() {
        return retailCustomer;
    }

    public void setRetailCustomer(RetailCustomer retailCustomer) {
        this.retailCustomer = retailCustomer;
    }

    public List<ElectricPowerUsageSummary> getElectricPowerUsageSummaries() {
        return electricPowerUsageSummaries;
    }

    public void addElectricPowerUsageSummary(ElectricPowerUsageSummary electricPowerUsageSummary) {
        electricPowerUsageSummaries.add(electricPowerUsageSummary);
    }
}
