package ar.edu.unlp.info.oo2.postapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PostApp {
    private List<Post> posts;

    public PostApp(){
        this.posts = new ArrayList<Post>();
    }

    public boolean crearPost(Usuario user, String texto) {
        return posts.add(new Post(user,texto));
    }

    public List<Post> ultimosPosts(Usuario user, int cantidad) {

        List<Post> postsOtrosUsuarios = new ArrayList<Post>();

        for (Post post : this.posts) {
            //compara un str con objeto usuario
            if (!post.getUsuario().equals(user)) {
                postsOtrosUsuarios.add(post);
            }
        }

        // ordena los posts por fecha
        for (int i = 0; i < postsOtrosUsuarios.size(); i++) {
            int masNuevo = i;
            for(int j= i +1; j < postsOtrosUsuarios.size(); j++) {
                if (postsOtrosUsuarios.get(j).getFecha().isAfter(
                        postsOtrosUsuarios.get(masNuevo).getFecha())) {
                    masNuevo = j;
                }
            }
            Post unPost = postsOtrosUsuarios.set(i,postsOtrosUsuarios.get(masNuevo));
            postsOtrosUsuarios.set(masNuevo, unPost);
        }

        List<Post> ultimosPosts = new ArrayList<Post>();
        int index = 0;
        Iterator<Post> postIterator = postsOtrosUsuarios.iterator();
        while (postIterator.hasNext() &&  index < cantidad) {
            ultimosPosts.add(postIterator.next());
            index++; //esto
        }
        return ultimosPosts;
    }

    public List<Post> ultimosPost2(Usuario user, int cantidad) {
        return this.posts.stream()
                .filter(post -> !post.perteneceA(user))
                .limit(cantidad)
                .sorted()
                .toList();
    }

}
