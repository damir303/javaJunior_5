package lesson15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public class CollUtils implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> res = new ArrayList<>();
        res.addAll(a);
        res.addAll(b);
        return res;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a == null || b == null) {
            throw new NullPointerException("a==null||b==null");
        } else {
            ArrayList<Integer> res = new ArrayList<>();
            var i = a;
            i.removeAll(b);
            a.removeAll(i);
            res.addAll(a);

            var j = b;
            j.removeAll(a);
            b.removeAll(j);

            res.addAll(b);

            return res;
        }
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return null;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return null;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return null;
    }

    public Set<Integer> qwe() throws Exception {
        return null;
    }
}
