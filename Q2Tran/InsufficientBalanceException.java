package Q2Tran;

public class InsufficientBalanceException extends RuntimeException
{
		private String message;
		public InsufficientBalanceException() { }
		public InsufficientBalanceException(String message) 
		{
			this.message = message;
		}

		public String getMessage() 
		{
			return message;
		}

		public void setMessage(String message) 
		{
			this.message = message;
		}
		public String toString() 
		{
			return "InsufficientBalanceException " + message ;
		}
}
