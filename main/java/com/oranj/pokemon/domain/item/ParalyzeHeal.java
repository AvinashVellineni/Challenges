package com.oranj.pokemon.domain.item;

import com.oranj.pokemon.constant.Status;
import com.oranj.pokemon.domain.Battle;
import com.oranj.pokemon.domain.Trainer;
import com.oranj.pokemon.domain.monsters.Pokemon;

public class ParalyzeHeal extends Item {
	
	public ParalyzeHeal() {}

	public ParalyzeHeal(long id, int quantity) {
		super(id, quantity);
	}
	
	@Override
	public void apply(Battle battle, Trainer activeTrainer, Trainer idleTrainer) {
		// YOUR CODE HERE (don't delete these comments):
		// be sure:
		// 1.) active pokemon is relieved of correct PARALYZED status, if present
		// 2.) other Stasuses afflicting pokemon are preserved
		return;
	}
}
