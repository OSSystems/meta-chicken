SECTION = "devel/chicken"
DESCRIPTION = "A trie (prefix tree) implementation"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://trie.meta;md5=e36be7df8c8930a4d76f5540cb8506b4"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "358cf938558b3144e9e4d4251ea81245"
SRC_URI[sha256sum] = "512435328b41b74fd4a5d5c9e58477cdd3d1bde2e9e4fc0e64eec8abb6cee0f7"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
