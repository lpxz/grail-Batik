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
package org.apache.batik.transcoder;

/**
 * This class can be the base class of a transcoder which may support
 * transcoding hints and/or error handler.
 *
 * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a>
 * @version $Id: AbstractTranscoder.java 1372129 2012-08-12 15:31:50Z helder $
 */
public abstract class AbstractTranscoder extends TranscoderSupport
    implements Transcoder {

    /**
     * Constructs a new <code>AbstractTranscoder</code>.
     */
    protected AbstractTranscoder() {}
}
