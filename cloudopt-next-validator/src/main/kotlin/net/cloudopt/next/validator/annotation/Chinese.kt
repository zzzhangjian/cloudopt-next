/*
 * Copyright 2017-2020 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.cloudopt.next.validator.annotation

import net.cloudopt.next.validator.ChineseValidator
import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy.RUNTIME
import javax.validation.Constraint
import javax.validation.Payload
import kotlin.reflect.KClass

/*
 * @author: Cloudopt
 * @Time: 2018/6/14
 * @Description: It is used to verify whether it is Chinese
 */
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER,
    AnnotationTarget.FIELD,
    AnnotationTarget.ANNOTATION_CLASS,
    AnnotationTarget.VALUE_PARAMETER
)
@Retention(RUNTIME)
@Constraint(validatedBy = arrayOf(ChineseValidator::class))
@Documented
annotation class Chinese(
    val value: Boolean,
    val message: String = "{constraints.chinese.message}",
    val groups: Array<KClass<*>> = arrayOf(),
    val payload: Array<KClass<out Payload>> = arrayOf()
)

