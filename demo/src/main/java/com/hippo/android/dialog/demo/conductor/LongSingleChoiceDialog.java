/*
 * Copyright 2017 Hippo Seven
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

package com.hippo.android.dialog.demo.conductor;

/*
 * Created by Hippo on 4/7/2017.
 */

import android.os.Bundle;
import com.hippo.android.dialog.demo.Constants;

public class LongSingleChoiceDialog extends SingleChoiceDialog {

  public LongSingleChoiceDialog(boolean header, boolean footer) {
    super(header, footer);
  }

  public LongSingleChoiceDialog(Bundle bundle) {
    super(bundle);
  }

  @Override
  protected String getTitle() {
    return Constants.LONG_LIST_TITLE;
  }

  @Override
  protected String[] getItems() {
    return Constants.LONG_LIST;
  }
}