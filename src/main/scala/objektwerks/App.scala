package objektwerks

import dev.langchain4j.model.openai.OpenAiChatModel

import java.time.Duration

@main def runApp(args: String*): Unit =
  val apiKey = sys.env("OPENAI_API_KEY")
  val modelName = "gpt-4o-mini"

  val chatModel = OpenAiChatModel
    .builder()
    .apiKey(apiKey)
    .modelName(modelName)
    .timeout(Duration.ofSeconds(30))
    .logRequests(true)
    .logResponses(true)
    .build()

  val topic = if args.nonEmpty then args(0) else "Indian Pale Ale"
  val request = s"Tell me about this beer style, $topic"
  val response = chatModel.chat(request)

  println(s"*** OpenAI Chat Model: $modelName")
  println(s"*** Request: $request")
  println(s"*** Response: $response")