/**
 * Copyright © 2017 jsonzou (keko-boy@163.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.jsonzou.jmockdata.test.custommocktemplate;

import com.github.jsonzou.jmockdata.mockdata.JmockDataContext;
import com.github.jsonzou.jmockdata.mockdata.JmockDataTemplateDefault;

/**
 * Created by jsonzou on 2016/12/27.
 */
public class CustomJmockDataTemplate extends JmockDataTemplateDefault {
    @Override
    public String mockString(JmockDataContext context) {
        if("stringv".equals(context.getName())){
            return "ABC-{"+super.mockString(context)+"}-XYZ";
        }
        return super.mockString(context);
    }
}
