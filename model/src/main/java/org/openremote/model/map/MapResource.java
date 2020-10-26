/*
 * Copyright 2016, OpenRemote Inc.
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
package org.openremote.model.map;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.openremote.model.http.RequestParams;
import org.openremote.model.http.SuccessStatusCode;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("map")
public interface MapResource {

    /**
     * Returns style used to initialise Mapbox GL
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @SuccessStatusCode(200)
    @SuppressWarnings("unusable-by-js")
    ObjectNode getSettings(@BeanParam RequestParams requestParams);

    /**
     * Returns tileJSON object used to initialise Mapbox JS
     */
    @GET
    @Path("js")
    @Produces(MediaType.APPLICATION_JSON)
    @SuccessStatusCode(200)
    @SuppressWarnings("unusable-by-js")
    ObjectNode getSettingsJs(@BeanParam RequestParams requestParams);

    /**
     * Gets vector tile data for Mapbox GL
     */
    @GET
    @Produces("application/vnd.mapbox-vector-tile")
    @Path("tile/{zoom}/{column}/{row}")
    @SuppressWarnings("unusable-by-js")
    byte[] getTile(@PathParam("zoom")int zoom, @PathParam("column")int column, @PathParam("row")int row);
}
