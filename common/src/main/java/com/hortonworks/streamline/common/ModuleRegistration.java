/**
  * Copyright 2017 Hortonworks.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at

  *   http://www.apache.org/licenses/LICENSE-2.0

  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
 **/
package com.hortonworks.streamline.common;

import com.hortonworks.streamline.common.util.FileStorage;

import java.util.List;
import java.util.Map;

/**
 * An interface expected to be implemented by indepenedent modules so that they can be registered with web service module on startup
 */
public interface ModuleRegistration {

    /**
     *
     * @param config module specific config from the yaml file
     * @param fileStorage file storage implementation that Streamline is initialized with for the module to use if at all
     */
    void init (Map<String, Object> config, FileStorage fileStorage);

    /**
     *
     * @return list of resources to register with the web service module to handle end points for this module
     */
    List<Object> getResources ();
}
