/*-
 * ============LICENSE_START=======================================================
 * openECOMP : SDN-C
 * ================================================================================
 * Copyright (C) 2017 AT&T Intellectual Property. All rights
 * 			reserved.
 * 	Modifications Copyright © 2018 IBM.
 * ================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END=========================================================
 */

package org.onap.ccsdk.sli.plugins.restapicall;

public enum HttpMethod {
    GET, POST, PUT, DELETE, PATCH;

    public static HttpMethod fromString(String s) {
        if (s == null)
            return null;
        if (("get").equalsIgnoreCase(s))
            return GET;
        if (("post").equalsIgnoreCase(s))
            return POST;
        if (("put").equalsIgnoreCase(s))
            return PUT;
        if (("delete").equalsIgnoreCase(s))
            return DELETE;
        if (("patch").equalsIgnoreCase(s))
            return PATCH;
        throw new IllegalArgumentException("Invalid value for HTTP Method: " + s);
    }
}
