/*
 * SteVe - SteckdosenVerwaltung - https://github.com/steve-community/steve
 * Copyright (C) 2013-2024 SteVe Community Team
 * All Rights Reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package de.rwth.idsg.steve.web.api.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 * @author fnkbsi
 * @since 18.10.2023
 */
@Getter
@Setter
public class ApiChargePointStart {
    
    @NotNull
    @Schema(description = "Charge Box ID", required = true)
    private String chargeBoxId;
    
    @NotNull
    @Schema(description = "Connector ID", required = true)
    private Integer connectorId;
    
    @NotNull
    @Schema(description = "OCPP Tag", required = true)
    private String ocppTag;

    @JsonCreator
    public ApiChargePointStart(
            @JsonProperty("chargeBoxId") String chargeBoxId,
            @JsonProperty("connectorId") Integer connectorId,
            @JsonProperty("ocppTag") String ocppTag) {
        this.chargeBoxId = chargeBoxId;
        this.connectorId = connectorId;
        this.ocppTag = ocppTag;
    }

    // Default constructor needed for Spring's @Valid annotation
    public ApiChargePointStart() {
    }
}