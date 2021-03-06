/*
 * Copyright 2017-2020 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.cloudopt.next.web.test.controller

import io.vertx.core.http.ServerWebSocket
import net.cloudopt.next.web.WebSocketResource
import net.cloudopt.next.web.route.WebSocket


/*
 * @author: Cloudopt
 * @Time: 2020/7/19
 * @Description: Test WebSocket Controller
 */

@WebSocket("/websocket")
class WebSocketController : WebSocketResource {
    override fun handler(userWebSocketConnection: ServerWebSocket) {
        println("Connected!")
        userWebSocketConnection.writeTextMessage("Hello World")
        userWebSocketConnection.frameHandler { frame ->
            println(frame.textData())
        }
    }


}