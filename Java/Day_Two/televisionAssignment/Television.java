
/*Design a Television class, refer below hints for its state and behavior and test it Using JUnit:-
state (on/off), 
current volume, 
current channel, 
increase and decrease volume and 
change channel
turn it on and off.
    
Design this class, create an instance, turn on, increase and decrease the volume, change channels..get information about state,
volume and channel..finally turn it off.*/
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------


package television;

public class Television 
{

	private String state;
	private int channel;
	private int volume;
	
	
	public String getState() 
	{
		return state;
	}
	public void setState(String state) 
	{
		this.state = state;	
	}
	public int getChannel() 
	{
		return channel;
	}
	public void setChannel(int channel) 
	{
		this.channel = channel;
	}
	public int getVolume() 
	{
		return this.volume;
	}
	public void setVolume(int volume) 
	{
		this.volume = volume;
	}
	
	public int volumeIncrease(int volume)
	{
		setVolume(this.getVolume()+volume);
		return volume+getVolume();	
	}
	
	public int volumeDecrease(int volume)
	{
		if((getVolume()- volume) < 0)
		{
			setVolume(0);
			return 0;
		}
		else
		{
			setVolume(this.getVolume()-volume);
			return (this.getVolume()- volume);
		}	
		
	}
	
	public int changeChannel(int newChannel)
	{
		
		int changedChannel = getChannel() + newChannel;
		if (changedChannel < 0)
		{
			setChannel(0);	
			return 0;
		} 
		else {
				setChannel(changedChannel);
				return changedChannel;
			}
	}
	
}			

