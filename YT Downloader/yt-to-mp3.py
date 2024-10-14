import tkinter as tk
from tkinter import messagebox
from pytube import YouTube
from pydub import AudioSegment
import os
from pydub.utils import which

# Ensure pydub can find ffmpeg
AudioSegment.converter = which("ffmpeg")

def download_youtube_audio(url, output_path='downloads'):
    try:
        # Create the downloads directory if it doesn't exist
        if not os.path.exists(output_path):
            os.makedirs(output_path)
        
        # Download the video
        yt = YouTube(url)
        stream = yt.streams.filter(only_audio=True).first()
        audio_file = stream.download(output_path=output_path)

        # Convert to MP3
        base, ext = os.path.splitext(audio_file)
        mp3_file = base + '.mp3'

        # Use pydub to convert the file to MP3
        audio = AudioSegment.from_file(audio_file)
        audio.export(mp3_file, format='mp3', bitrate="320k")

        # Optionally, remove the original file
        os.remove(audio_file)

        messagebox.showinfo("Success", f"Downloaded and converted to MP3: {mp3_file}")
    except Exception as e:
        messagebox.showerror("Error", str(e))

def start_download():
    url = url_entry.get()
    if url:
        download_youtube_audio(url)
    else:
        messagebox.showwarning("Input Error", "Please enter a YouTube URL")

# Create the main window
root = tk.Tk()
root.title("YouTube to MP3 Converter")

# Create and place the widgets
tk.Label(root, text="YouTube URL:").pack(pady=10)
url_entry = tk.Entry(root, width=50)
url_entry.pack(pady=5)
download_button = tk.Button(root, text="Download", command=start_download)
download_button.pack(pady=20)

# Run the main loop
root.mainloop()