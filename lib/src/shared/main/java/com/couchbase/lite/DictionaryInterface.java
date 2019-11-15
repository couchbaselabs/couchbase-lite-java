//
// DictionaryInterface.java
//
// Copyright (c) 2017 Couchbase, Inc All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
package com.couchbase.lite;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 * Note: DictionaryInterface is an internal interface. This should not be public.
 */
public interface DictionaryInterface {
    int count();

    // Return a COPY of all keys
    @NonNull
    List<String> getKeys();

    // Array, Blob, Boolean, Dictionary, Number, String
    @Nullable
    Object getValue(@NonNull String key);

    @Nullable
    String getString(@NonNull String key);

    @Nullable
    Number getNumber(@NonNull String key);

    int getInt(@NonNull String key);

    long getLong(@NonNull String key);

    float getFloat(@NonNull String key);

    double getDouble(@NonNull String key);

    boolean getBoolean(@NonNull String key);

    @Nullable
    Blob getBlob(@NonNull String key);

    @Nullable
    Date getDate(@NonNull String key);

    @Nullable
    ArrayInterface getArray(@NonNull String key);

    @Nullable
    DictionaryInterface getDictionary(@NonNull String key);

    @NonNull
    Map<String, Object> toMap();

    boolean contains(@NonNull String key);
}
