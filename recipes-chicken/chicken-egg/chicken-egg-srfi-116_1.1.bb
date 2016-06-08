SECTION = "devel/chicken"
DESCRIPTION = "Immutable Lists."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://srfi-116.meta;md5=c6c01882ea657fc1de18f3dd6e8be2bf"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-116/srfi-116-${PV}.tar.gz"

SRC_URI[md5sum] = "66daca74542a867fa47ee244ac59e2ea"
SRC_URI[sha256sum] = "43f58b7a6da568ca718efafb69a0e565ee3335aab0bff001a28dde62173b68ab"

S = "${WORKDIR}/srfi-116-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
