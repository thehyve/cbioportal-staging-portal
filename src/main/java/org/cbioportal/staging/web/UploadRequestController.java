/*
 * Copyright (c) 2017 The Hyve B.V.
 * This code is licensed under the GNU Affero General Public License (AGPL),
 * version 3, or (at your option) any later version.
 */

/*
 * This file is part of cBioPortal-staging.
 *
 * cBioPortal-staging is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package org.cbioportal.staging.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import org.cbioportal.staging.service.UploadRequestService;
import org.cbioportal.staging.service.exception.UploadRequestNotFoundException;
import org.cbioportal.staging.model.UploadRequest;

import org.cbioportal.staging.web.config.annotation.PublicApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@PublicApi
@RestController
@Validated
@Api(tags = "Upload requests", description = " ")
public class UploadRequestController {

    @Autowired
    private UploadRequestService uploadRequestService;



    @RequestMapping(value = "/ur/{uploadRequestId}", method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation("Get an Upload Request (UR) by Id")
    public ResponseEntity<UploadRequest> getUploadRequest(
        @ApiParam(required = true, value = "Upload Request Id")
        @PathVariable Integer uploadRequestId) throws UploadRequestNotFoundException {

        return new ResponseEntity<>(uploadRequestService.getUploadRequest(uploadRequestId), HttpStatus.OK);
    }
}
