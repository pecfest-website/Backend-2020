package com.fest.pecfestBackend.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name ="Team")
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long teamId;

	@Column(nullable = false,unique = true)
	private String teamName;

	@Column(nullable = false)
	private long eventId;

	@Column(nullable = false)
	private long leaderPecFestId;
		
	@Column
	private long[] memberPecFestIdList;

}
