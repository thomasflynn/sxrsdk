/* Copyright 2016 Samsung Electronics Co., LTD
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

package com.samsungxr.x3d;


/**
 * Holds a single x, y texture coordinate
 */
public class TextureValues
{
  public float[] coord =
  {
      0, 0
  };

  public TextureValues(float u, float v)
  {
    coord[0] = u;
    coord[1] = v;
  }

  public TextureValues(float[] textureCoord)
  {
    coord[0] = textureCoord[0];
    coord[1] = textureCoord[1];
  }


}
