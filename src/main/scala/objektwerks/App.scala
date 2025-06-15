package objektwerks

import dev.langchain4j.model.openai.OpenAiChatModel

@main def runApp(): Unit =
  val openAiApiKey = sys.env("OPENAI_API_KEY")
  val modelName = "gpt-4o-mini"

  val model = OpenAiChatModel.builder()
    .apiKey(openAiApiKey)
    .modelName(modelName)
    .build()

  val answer = model.chat("Say 'Hello World'")
  println(answer)