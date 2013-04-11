/*
 * Copyright 2013 Telly Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.groundy.example;

import android.os.Bundle;
import com.groundy.example.tasks.RandomTimeTask;
import com.telly.groundy.Groundy;

public class ExecuteExample extends QueueExample {
  @Override
  protected long processTask(Bundle params) {
    return Groundy.create(this, RandomTimeTask.class).params(params).service(AsyncGroundyService.class)
        .receiver(mReceiver).execute();
  }
}
