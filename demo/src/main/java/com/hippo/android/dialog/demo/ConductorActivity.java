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

package com.hippo.android.dialog.demo;

/*
 * Created by Hippo on 4/3/2017.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import com.bluelinelabs.conductor.Conductor;
import com.bluelinelabs.conductor.Router;
import com.bluelinelabs.conductor.RouterTransaction;
import com.hippo.android.dialog.demo.conductor.HomeController;

public class ConductorActivity extends AppCompatActivity {

  private Router router;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_conductor);

    ViewGroup container = (ViewGroup) findViewById(R.id.controller_container);
    router = Conductor.attachRouter(this, container, savedInstanceState);
    if (!router.hasRootController()) {
      RouterTransaction transaction = RouterTransaction.with(new HomeController());
      router.setRoot(transaction);
    }
  }

  @Override
  public void onBackPressed() {
    if (router == null || !router.handleBack()) {
      super.onBackPressed();
    }
  }
}
