public class AudioPlayer implements MediaPlayer
{

	@Override
	public void play(MediaType mediaType, String fileName)
	{
		if (mediaType == MediaType.MP3)
		{
			System.out.println("Playing MP3: " + fileName);
		}
		else
		{
			MediaPlayerAdapter adapter = new MediaPlayerAdapter(mediaType);
			adapter.play(mediaType, fileName);
		       	
		}
	}
}
