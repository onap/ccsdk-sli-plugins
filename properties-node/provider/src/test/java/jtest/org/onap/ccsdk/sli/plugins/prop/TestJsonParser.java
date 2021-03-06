/*-
 * ============LICENSE_START=======================================================
 * openECOMP : SDN-C
 * ================================================================================
 * Copyright (C) 2017 AT&T Intellectual Property. All rights
 * 			reserved.
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

package jtest.org.onap.ccsdk.sli.plugins.prop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.onap.ccsdk.sli.core.sli.SvcLogicException;
import org.onap.ccsdk.sli.plugins.prop.JsonParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestJsonParser {

    private static final Logger log = LoggerFactory.getLogger(TestJsonParser.class);

    @Test
    public void test() throws SvcLogicException, IOException {
        BufferedReader in = new BufferedReader(
                new InputStreamReader(ClassLoader.getSystemResourceAsStream("test.json"))
        );
        StringBuilder b = new StringBuilder();
        String line;
        while ((line = in.readLine()) != null)
            b.append(line).append('\n');

        Map<String, String> mm = JsonParser.convertToProperties(b.toString());

        logProperties(mm);

        in.close();
    }

    @Test(expected = NullPointerException.class)
    public void testNullString() throws SvcLogicException {
        JsonParser.convertToProperties(null);
    }

    private void logProperties(Map<String, String> mm) {
        List<String> ll = new ArrayList<>();
        for (Object o : mm.keySet())
            ll.add((String) o);
        Collections.sort(ll);
        log.info("Properties:");
        for (String name : ll)
            log.info("--- {}: {}", name, mm.get(name));
    }
}
