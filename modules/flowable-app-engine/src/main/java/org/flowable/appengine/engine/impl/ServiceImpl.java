/* Licensed under the Apache License, Version 2.0 (the "License");
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
 */
package org.flowable.appengine.engine.impl;

import org.flowable.appengine.engine.AppEngineConfiguration;
import org.flowable.engine.common.impl.interceptor.CommandExecutor;

public class ServiceImpl {

    protected AppEngineConfiguration cmmnEngineConfiguration;
    protected CommandExecutor commandExecutor;

    public ServiceImpl() {
    }

    public ServiceImpl(AppEngineConfiguration cmmnEngineConfiguration) {
        this.cmmnEngineConfiguration = cmmnEngineConfiguration;
    }
    
    public AppEngineConfiguration getEnginConfiguration() {
        return cmmnEngineConfiguration;
    }

    public void setEngineConfig(AppEngineConfiguration cmmnEngineConfiguration) {
        this.cmmnEngineConfiguration = cmmnEngineConfiguration;
    }

    public CommandExecutor getCommandExecutor() {
        return commandExecutor;
    }

    public void setCommandExecutor(CommandExecutor commandExecutor) {
        this.commandExecutor = commandExecutor;
    }
    
}
