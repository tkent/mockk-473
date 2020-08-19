package example

import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Test

class TestMocking {

  @Test
  fun test_embedded_enum_with_method_mocking(){
    val mockEmbeddedEnumExample = mockk<EmbeddedEnumExample>()
    every {
      mockEmbeddedEnumExample.withMethodType
    } returns EmbeddedEnumExample.WithMethodType.SECOND
  }

  @Test
  fun test_embedded_enum_without_method_mocking(){
    val mockEmbeddedEnumExample = mockk<EmbeddedEnumExample>()
    every {
      mockEmbeddedEnumExample.withoutMethodType
    } returns EmbeddedEnumExample.WithoutMethodType.SECOND
  }

  @Test
  fun test_separate_enum_with_method_mocking(){
    val mockSeparateEnumExample = mockk<SeparateEnumExample>()
    every { mockSeparateEnumExample.type } returns WithMethodType.SECOND
  }
}