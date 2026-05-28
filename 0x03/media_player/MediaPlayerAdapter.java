public class MediaPlayerAdapter implements MediaPlayer
{
	private AdvancedMediaPlayer advancedMediaPlayer;
	private MediaType mediaType;


	public MediaPlayerAdapter(MediaType mediaType)
	{
		this.mediaType = mediaType;

		if (mediaType != MediaType.MP3)
		{
			this.advancedMediaPlayer = new VideoMediaPlayer();
		}
	}


	@Override
	public void play(MediaType mediaType, String fileName)
	{
		if (this.advancedMediaPlayer == null)
		{
			return;
		}

		switch (mediaType)
		{
			case VLC:
				this.advancedMediaPlayer.playVLC(fileName);
				break;

			case MP4:
                                this.advancedMediaPlayer.playMP4(fileName);
                                break;

			default:
				break;
		}
	}
}
