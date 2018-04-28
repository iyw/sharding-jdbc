/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
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
 * </p>
 */

package io.shardingjdbc.core.routing.router;

import io.shardingjdbc.core.parsing.parser.context.condition.Column;
import io.shardingjdbc.core.parsing.parser.context.condition.GeneratedKeyCondition;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.LinkedList;
import java.util.List;

/**
 * Generated key.
 *
 * @author zhangliang
 * @author maxiaoguang
 */
@RequiredArgsConstructor
@Getter
public final class GeneratedKey {
    
    private final Column column;
    
    private final int index;
    
    private final Number value;
    
    private final List<Number> generatedKeys = new LinkedList<>();
    
    public GeneratedKey(final GeneratedKeyCondition generatedKeyCondition) {
        column = generatedKeyCondition.getColumn();
        index = generatedKeyCondition.getIndex();
        value = generatedKeyCondition.getValue();
    }
}