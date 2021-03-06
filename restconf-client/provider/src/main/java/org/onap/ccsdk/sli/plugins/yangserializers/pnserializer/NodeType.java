/*-
 * ============LICENSE_START=======================================================
 * ONAP - CCSDK
 * ================================================================================
 * Copyright (C) 2018 Huawei Technologies Co., Ltd. All rights reserved.
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

package org.onap.ccsdk.sli.plugins.yangserializers.pnserializer;

/**
 * Representation of types of node in properties node tree.
 */
public enum NodeType {
    SINGLE_INSTANCE_NODE,
    MULTI_INSTANCE_NODE,
    SINGLE_INSTANCE_LEAF_NODE,
    MULTI_INSTANCE_LEAF_NODE,
    MULTI_INSTANCE_HOLDER_NODE,
    MULTI_INSTANCE_LEAF_HOLDER_NODE,
    ANY_XML_NODE
}
