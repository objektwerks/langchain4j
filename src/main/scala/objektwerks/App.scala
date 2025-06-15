package objektwerks

import dev.langchain4j.model.openai.OpenAiChatModel

import java.time.Duration

@main def runApp(): Unit =
  val apiKey = sys.env("OPENAI_API_KEY")
  val modelName = "gpt-4o-mini"

  val model = OpenAiChatModel
    .builder()
    .apiKey(apiKey)
    .modelName(modelName)
    .temperature(0.3)
    .timeout(Duration.ofSeconds(30))
    .logRequests(true)
    .logResponses(true)
    .build()

  val request = "Say 'Hello World'"
  val response = model.chat(request)

  println(s"*** OpenAI Model: $modelName")
  println(s"*** Request: $request")
  println(s"*** Response: $response")