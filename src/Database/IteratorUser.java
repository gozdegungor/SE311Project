package Database;

import java.util.ArrayList;

public class IteratorUser {
      public AbstractIterator createIterator(ArrayList<User> arr) {
        return new UserIterator(arr);
    }
}

    interface AbstractIterator{
        void First();
        void Next();
        Boolean IsDone();
        User CurrentItem();
    }

    class UserIterator implements AbstractIterator{
        private ArrayList<User> _users;
        private int position;

        public UserIterator(ArrayList<User> users)
        {
            _users = users;
            position = 0;
        }
        public void First(){position = 0;}
        public void Next(){position++;}
        public Boolean IsDone(){return position >= _users.size();}
        public User CurrentItem(){return (IsDone()?null: _users.get(position));}
    }





