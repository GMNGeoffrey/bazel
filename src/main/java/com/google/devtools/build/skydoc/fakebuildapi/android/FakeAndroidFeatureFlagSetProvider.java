// Copyright 2020 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.devtools.build.skydoc.fakebuildapi.android;

import com.google.common.collect.ImmutableMap;
import com.google.devtools.build.lib.cmdline.Label;
import com.google.devtools.build.lib.starlarkbuildapi.android.AndroidFeatureFlagSetProviderApi;
import net.starlark.java.eval.Dict;
import net.starlark.java.eval.EvalException;

/** Fake implementation of {@link AndroidFeatureFlagSetProviderApi}. */
public class FakeAndroidFeatureFlagSetProvider implements AndroidFeatureFlagSetProviderApi {

  @Override
  public ImmutableMap<Label, String> getFlagMap() {
    return null;
  }

  @Override
  public String toProto() throws EvalException {
    return null;
  }

  @Override
  public String toJson() throws EvalException {
    return null;
  }

  /** Fake implementation of {@link AndroidFeatureFlagSetProviderApi}. */
  public static class FakeProvider implements AndroidFeatureFlagSetProviderApi.Provider {

    @Override
    public AndroidFeatureFlagSetProviderApi create(Dict<?, ?> flags) throws EvalException {
      return new FakeAndroidFeatureFlagSetProvider();
    }
  }
}
