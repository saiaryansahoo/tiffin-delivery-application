package food.app.demo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FoodsFragment extends Fragment {

    RecyclerView recyclerView;
    FoodAdapter foodAdapter;
    List<FoodItemModel> list;

    public FoodsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_foods, container, false);

        list = new ArrayList<>();
        list.add(new FoodItemModel(R.drawable.food_img_1, "VEG LUNCH", "Rs: 179"));
        list.add(new FoodItemModel(R.drawable.food_img_2, "NON-VEG LUNCH ", "Rs: 239"));
        list.add(new FoodItemModel(R.drawable.food_img_1, "VEG DINNER", "Rs: 189"));
        list.add(new FoodItemModel(R.drawable.food_img_1, "NON-VEG DINNER", "Rs: 249"));


        recyclerView = view.findViewById(R.id.food_recycler);
        foodAdapter = new FoodAdapter(list, getActivity().getApplicationContext());
        LinearLayoutManager manager = new LinearLayoutManager(getActivity().getApplicationContext(), RecyclerView.HORIZONTAL, false);
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(foodAdapter);
        return view;
    }
}