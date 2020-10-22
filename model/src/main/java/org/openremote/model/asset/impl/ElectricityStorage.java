/*
 * Copyright 2020, OpenRemote Inc.
 *
 * See the CONTRIBUTORS.txt file in the distribution for a
 * full listing of individual contributors.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.openremote.model.asset.impl;

import org.openremote.model.Constants;
import org.openremote.model.asset.AssetDescriptor;
import org.openremote.model.attribute.Attribute;
import org.openremote.model.attribute.MetaItem;
import org.openremote.model.v2.AttributeDescriptor;
import org.openremote.model.v2.MetaTypes;
import org.openremote.model.v2.ValueTypes;

public class ElectricityStorage extends Device {

    public static final AttributeDescriptor<String> STATUS = new AttributeDescriptor<>("status", true, ValueTypes.STRING, null,
        new MetaItem<>(MetaTypes.READ_ONLY, true)
    );
    public static final AttributeDescriptor<Double> LEVELISED_COST_OF_STORAGE = new AttributeDescriptor<>("levelisedCostOfStorage", true, ValueTypes.POSITIVE_NUMBER, null,
        new MetaItem<>(MetaTypes.UNIT_TYPE, Constants.UNITS_CURRENCY_EUR)
    );
    public static final AttributeDescriptor<Double> ENERGY_CAPACITY = new AttributeDescriptor<>("energyCapacity", true, ValueTypes.POSITIVE_NUMBER, null,
        new MetaItem<>(MetaTypes.UNIT_TYPE, Constants.UNITS_ENERGY_KILOWATT_HOUR),
        new MetaItem<>(MetaTypes.READ_ONLY, true)
    );
    public static final AttributeDescriptor<Integer> ENERGY_IN_PERCENTAGE = new AttributeDescriptor<>("energyInPercentage", true, ValueTypes.PERCENTAGE_INTEGER_0_100, null);
    public static final AttributeDescriptor<Double> ENERGY_IN = new AttributeDescriptor<>("energyIn", true, ValueTypes.POSITIVE_NUMBER, null,
        new MetaItem<>(MetaTypes.UNIT_TYPE, Constants.UNITS_ENERGY_KILOWATT_HOUR),
        new MetaItem<>(MetaTypes.READ_ONLY, true)
    );
    public static final AttributeDescriptor<Double> ENERGY_CAPACITY_REMAINING = new AttributeDescriptor<>("energyCapacityRemaining", true, ValueTypes.POSITIVE_NUMBER, null,
        new MetaItem<>(MetaTypes.UNIT_TYPE, Constants.UNITS_ENERGY_KILOWATT_HOUR),
        new MetaItem<>(MetaTypes.READ_ONLY, true)
    );
    public static final AttributeDescriptor<Double> ENERGY_IN_TOTAL = new AttributeDescriptor<>("energyInTotal", true, ValueTypes.POSITIVE_NUMBER, null,
        new MetaItem<>(MetaTypes.UNIT_TYPE, Constants.UNITS_ENERGY_KILOWATT_HOUR),
        new MetaItem<>(MetaTypes.READ_ONLY, true)
    );
    public static final AttributeDescriptor<Double> ENERGY_OUT_TOTAL = new AttributeDescriptor<>("energyOutTotal", true, ValueTypes.POSITIVE_NUMBER, null,
        new MetaItem<>(MetaTypes.UNIT_TYPE, Constants.UNITS_ENERGY_KILOWATT_HOUR),
        new MetaItem<>(MetaTypes.READ_ONLY, true)
    );
    public static final AttributeDescriptor<Double> POWER_CAPACITY_IN = new AttributeDescriptor<>("powerCapacityIn", true, ValueTypes.POSITIVE_NUMBER, null,
        new MetaItem<>(MetaTypes.UNIT_TYPE, Constants.UNITS_POWER_KILOWATT)
    );
    public static final AttributeDescriptor<Double> POWER_CAPACITY_OUT = new AttributeDescriptor<>("powerCapacityOut", true, ValueTypes.POSITIVE_NUMBER, null,
        new MetaItem<>(MetaTypes.UNIT_TYPE, Constants.UNITS_POWER_KILOWATT)
    );
    public static final AttributeDescriptor<Double> POWER_TOTAL = new AttributeDescriptor<>("powerTotal", true, ValueTypes.POSITIVE_NUMBER, null,
        new MetaItem<>(MetaTypes.UNIT_TYPE, Constants.UNITS_POWER_KILOWATT),
        new MetaItem<>(MetaTypes.READ_ONLY, true)
    );
    public static final AttributeDescriptor<Double> POWER_SETPOINT = new AttributeDescriptor<>("powerSetpoint", true, ValueTypes.POSITIVE_NUMBER, null,
        new MetaItem<>(MetaTypes.UNIT_TYPE, Constants.UNITS_POWER_KILOWATT)
    );
    public static final AttributeDescriptor<Integer> CHARGE_CYCLES = new AttributeDescriptor<>("chargeCycles", true, ValueTypes.POSITIVE_INTEGER, null,
        new MetaItem<>(MetaTypes.READ_ONLY, true)
    );
    public static final AttributeDescriptor<Double> FINANCIAL_WALLET = new AttributeDescriptor<>("financialWallet", true, ValueTypes.POSITIVE_NUMBER, null,
        new MetaItem<>(MetaTypes.UNIT_TYPE, Constants.UNITS_CURRENCY_EUR)
    );
    public static final AttributeDescriptor<Integer> CARBON_WALLET = new AttributeDescriptor<>("carbonWallet", true, ValueTypes.POSITIVE_INTEGER, null,
        new MetaItem<>(MetaTypes.UNIT_TYPE, Constants.UNITS_MASS_KILOGRAM),
        new MetaItem<>(MetaTypes.READ_ONLY, true)
    );

    public static final AssetDescriptor<ElectricityStorage> DESCRIPTOR = new AssetDescriptor<>("Electricity storage", "battery-charging", "1B7C89", ElectricityStorage.class);

    public ElectricityStorage(String name) {
        super(name, DESCRIPTOR);
    }

    public String getStatus() {
        return getAttributes().get(STATUS).flatMap(Attribute::getValue).orElse(null);
    }

    public Double getLevelisedCostOfStorage() {
        return getAttributes().get(LEVELISED_COST_OF_STORAGE).flatMap(Attribute::getValue).orElse(null);
    }

    public Double getEnergyCapacity() {
        return getAttributes().get(ENERGY_CAPACITY).flatMap(Attribute::getValue).orElse(null);
    }

    public Integer getEnergyInPercentage() {
        return getAttributes().get(ENERGY_IN_PERCENTAGE).flatMap(Attribute::getValue).orElse(null);
    }

    public Double getEnergyIn() {
        return getAttributes().get(ENERGY_IN).flatMap(Attribute::getValue).orElse(null);
    }

    public Double getEnergyCapacityRemaining() {
        return getAttributes().get(ENERGY_CAPACITY_REMAINING).flatMap(Attribute::getValue).orElse(null);
    }

    public Double getEnergyInTotal() {
        return getAttributes().get(ENERGY_IN_TOTAL).flatMap(Attribute::getValue).orElse(null);
    }

    public Double getEnergyOutTotal() {
        return getAttributes().get(ENERGY_OUT_TOTAL).flatMap(Attribute::getValue).orElse(null);
    }

    public Double getPowerCapacityIn() {
        return getAttributes().get(POWER_CAPACITY_IN).flatMap(Attribute::getValue).orElse(null);
    }

    public Double getPowerCapacityOut() {
        return getAttributes().get(POWER_CAPACITY_OUT).flatMap(Attribute::getValue).orElse(null);
    }

    public Double getPowerTotal() {
        return getAttributes().get(POWER_TOTAL).flatMap(Attribute::getValue).orElse(null);
    }

    public Double getPowerSetpoint() {
        return getAttributes().get(POWER_SETPOINT).flatMap(Attribute::getValue).orElse(null);
    }

    public Integer getChargeCycles() {
        return getAttributes().get(CHARGE_CYCLES).flatMap(Attribute::getValue).orElse(null);
    }

    public Double getFinancialWallet() {
        return getAttributes().get(FINANCIAL_WALLET).flatMap(Attribute::getValue).orElse(null);
    }

    public Integer getCarbonWallet() {
        return getAttributes().get(CARBON_WALLET).flatMap(Attribute::getValue).orElse(null);
    }
}
