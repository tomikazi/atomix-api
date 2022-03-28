# SPDX-FileCopyrightText: 2019-present Open Networking Foundation <info@opennetworking.org>
#
# SPDX-License-Identifier: Apache-2.0

.PHONY: build proto

build: license
	docker run -it -v `pwd`:/go/src/github.com/atomix/atomix-api \
		-w /go/src/github.com/atomix/atomix-api \
		--entrypoint build/bin/compile_protos.sh \
		`docker build -q build/docker`

reuse-tool: # @HELP install reuse if not present
	command -v reuse || python3 -m pip install reuse

license: reuse-tool # @HELP run license checks
	reuse lint
