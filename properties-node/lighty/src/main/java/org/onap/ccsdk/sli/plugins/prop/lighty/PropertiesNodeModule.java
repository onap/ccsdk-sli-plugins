/*
 * ============LICENSE_START==========================================
 * Copyright (c) 2019 PANTHEON.tech s.r.o.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, either express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 *
 */
package org.onap.ccsdk.sli.plugins.prop.lighty;

import io.lighty.core.controller.api.AbstractLightyModule;
import io.lighty.core.controller.api.LightyModule;
import org.onap.ccsdk.sli.plugins.prop.PropertiesNode;

/**
 * The implementation of the {@link io.lighty.core.controller.api.LightyModule} that manages and provides services from
 * the properties-node-provider artifact.
 */
public class PropertiesNodeModule extends AbstractLightyModule implements LightyModule {

    private PropertiesNode propertiesNode;

    @Override
    protected boolean initProcedure() {
        this.propertiesNode = new PropertiesNode();
        return true;
    }

    @Override
    protected boolean stopProcedure() {
        return true;
    }

    public PropertiesNode getPropertiesNode() {
        return this.propertiesNode;
    }
}
