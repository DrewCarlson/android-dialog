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

package com.hippo.android.dialog.base;

/*
 * Created by Hippo on 4/6/2017.
 */

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.widget.ListView;

class DialogListView extends ListView implements DialogContent {

  private Indicator indicator;

  public DialogListView(Context context) {
    super(context);
    init(context);
  }

  public DialogListView(Context context, AttributeSet attrs) {
    super(context, attrs);
    init(context);
  }

  public DialogListView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    init(context);
  }

  private void init(Context context) {
    indicator = new Indicator(context, this);
  }

  @Override
  public void draw(@NonNull Canvas canvas) {
    super.draw(canvas);
    indicator.drawIndicators(canvas);
  }

  @Override
  public void setHasHeader(boolean header) {
    indicator.setTopIndicatorEnabled(header);

    if (header) {
      // Clear top padding
      setPadding(getPaddingLeft(), 0, getPaddingRight(), getPaddingBottom());
    }
  }

  @Override
  public void setHasFooter(boolean footer) {
    indicator.setBottomIndicatorEnabled(footer);

    if (footer) {
      // Clear top padding
      setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), 0);
    }
  }
}
