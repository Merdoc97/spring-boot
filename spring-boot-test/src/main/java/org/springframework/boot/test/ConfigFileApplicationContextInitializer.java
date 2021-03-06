/*
 * Copyright 2012-2016 the original author or authors.
 *
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
 */

package org.springframework.boot.test;

import org.springframework.boot.context.config.ConfigFileApplicationListener;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.test.context.ContextConfiguration;

/**
 * {@link ApplicationContextInitializer} that can be used with the
 * {@link ContextConfiguration#initializers()} to trigger loading of
 * {@literal application.properties}.
 *
 * @author Phillip Webb
 * @see ConfigFileApplicationListener
 * @deprecated since 1.4.0 in favor of
 * {@link org.springframework.boot.test.context.ConfigFileApplicationContextInitializer}
 */
@Deprecated
public class ConfigFileApplicationContextInitializer extends
		org.springframework.boot.test.context.ConfigFileApplicationContextInitializer {

}
