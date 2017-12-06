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

package org.cbioportal.staging.service;

import org.cbioportal.staging.model.UploadRequest;
import org.springframework.stereotype.Service;

@Service
public class UploadRequestService {

    public UploadRequest getUploadRequest(Integer uploadRequestId) {
        // dummy / temp implementation for now:
        UploadRequest ur = new UploadRequest();
        ur.setUploadRequestId(991);
        return ur;
    }

}
