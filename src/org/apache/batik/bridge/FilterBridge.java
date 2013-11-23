/*

   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

 */
package org.apache.batik.bridge;

import org.apache.batik.ext.awt.image.renderable.Filter;
import org.apache.batik.gvt.GraphicsNode;
import org.w3c.dom.Element;

/**
 * Bridge class for vending <code>Filter</code> objects.
 *
 * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a>
 * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a>
 * @version $Id: FilterBridge.java 1372129 2012-08-12 15:31:50Z helder $
 */
public interface FilterBridge extends Bridge {

    /**
     * Creates a <code>Filter</code> according to the specified parameters.
     *
     * @param ctx the bridge context to use
     * @param filterElement the element that defines the filter
     * @param filteredElement the element that references the filter element
     * @param filteredNode the graphics node to filter
     */
    Filter createFilter(BridgeContext ctx,
                        Element filterElement,
                        Element filteredElement,
                        GraphicsNode filteredNode);

}
