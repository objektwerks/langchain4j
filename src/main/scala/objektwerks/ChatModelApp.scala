package objektwerks

import dev.langchain4j.model.openai.OpenAiChatModel

import java.time.Duration

@main def runChatModelApp(): Unit =
  val apiKey = sys.env("OPENAI_API_KEY")
  val modelName = "gpt-4o-mini"

  val chatModel = OpenAiChatModel
    .builder()
    .apiKey(apiKey)
    .modelName(modelName)
    .timeout(Duration.ofSeconds(10))
    .logRequests(true)
    .logResponses(true)
    .build()

  val request = "Say 'Hello, OpenAi'"
  val response = chatModel.chat(request)

  println(s"*** OpenAI Chat Model: $modelName")
  println(s"*** Request: $request")
  println(s"*** Response: $response")