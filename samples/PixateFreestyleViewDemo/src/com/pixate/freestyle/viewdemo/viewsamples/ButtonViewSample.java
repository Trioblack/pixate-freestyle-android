/*******************************************************************************
 * Copyright 2012-present Pixate, Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.pixate.freestyle.viewdemo.viewsamples;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;

import com.pixate.freestyle.PixateFreestyle;

/**
 * Creates {@link Button} views and adds them into a layout.
 * 
 * @author shalom
 */
public class ButtonViewSample extends ViewSampleBase {

    @Override
    public void createViews(Context context, ViewGroup layout) {
        Button button = new Button(context);
        button.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT));
        button.setText("Click Me!");
        PixateFreestyle.setStyleClass(button, "myButton");
        layout.addView(button);

        addView(button);
    }

}
