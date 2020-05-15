/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package io.smallrye.metrics.test.reusability;

import org.eclipse.microprofile.metrics.annotation.Counted;

public class ReusableMetricWithDifferingTagsBean {

    @Counted(name = "colorCounter", absolute = true, tags = { "color=blue" }, reusable = true)
    public void colorBlue1() {
    }

    @Counted(name = "colorCounter", absolute = true, tags = { "color=red" }, reusable = true)
    public void colorRed1() {
    }

    @Counted(name = "colorCounter", absolute = true, tags = { "color=blue" }, reusable = true)
    public void colorBlue2() {
    }

    @Counted(name = "colorCounter", absolute = true, tags = { "color=red" }, reusable = true)
    public void colorRed2() {
    }

}