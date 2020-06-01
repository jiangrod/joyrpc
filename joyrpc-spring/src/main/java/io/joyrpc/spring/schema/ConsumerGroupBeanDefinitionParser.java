package io.joyrpc.spring.schema;

/*-
 * #%L
 * joyrpc
 * %%
 * Copyright (C) 2019 joyrpc.io
 * %%
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
 * #L%
 */

import io.joyrpc.spring.ConsumerGroupBean;

/**
 * ConsumerGroupBean解析器
 */
public class ConsumerGroupBeanDefinitionParser extends AbstractInterfaceBeanDefinitionParser {

    /**
     * 构造函数
     */
    public ConsumerGroupBeanDefinitionParser() {
        super(ConsumerGroupBean.class, true);
    }

    @Override
    protected void addCustomParser() {
        super.addCustomParser();
        parsers.put("registry", new ReferenceParser());
    }
}
