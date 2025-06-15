package objektwerks

import dev.langchain4j.model.openai.OpenAiChatModel

@main def runApp(): Unit =
  val apiKey = sys.env("OPENAI_API_KEY")
  val modelName = "gpt-4o-mini"

  val model = OpenAiChatModel
    .builder()
    .apiKey(apiKey)
    .modelName(modelName)
    .build()

  val request = "Say 'Hello World'"
  val response = model.chat(request)
  
  println(s"*** OpenAI model: $modelName.")
  println(s"*** Request: $request")
  println(s"*** Response: $response")