/*
 * Copyright 2016 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.example.helloworld.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Greeting {
  private String name;
  private String greeting;

  public Greeting() {
    // For Jackson deserialization.
  }

  public Greeting(String name, String greeting) {
    this.name = name;
    this.greeting = greeting;
  }

  @JsonProperty
  public String getName() {
    return name;
  }

  @JsonProperty
  public String getGreeting() {
    return greeting;
  }
}
