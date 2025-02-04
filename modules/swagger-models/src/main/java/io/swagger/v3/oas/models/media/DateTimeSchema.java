/**
 * Copyright 2017 SmartBear Software
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.v3.oas.models.media;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * DateTimeSchema
 */

public class DateTimeSchema extends Schema<Date> {

    public DateTimeSchema() {
        super("string", "date-time");
    }

    public DateTimeSchema type(String type) {
        super.setType(type);
        return this;
    }

    public DateTimeSchema format(String format) {
        super.setFormat(format);
        return this;
    }

    public DateTimeSchema _default(Date _default) {
        super.setDefault(_default);
        return this;
    }

    @Override
    protected Date cast(Object value) {
        if (value != null) {
            try {
                if (value instanceof Date) {
                    return (Date) value;
                } else if (value instanceof String) {
                    return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").parse((String) value);
                }
            } catch (Exception e) {
            }
        }
        return null;
    }

    public DateTimeSchema _enum(List<Date> _enum) {
        super.setEnum(_enum);
        return this;
    }

    public DateTimeSchema addEnumItem(Date _enumItem) {
        super.addEnumItemObject(_enumItem);
        return this;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DateTimeSchema {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
