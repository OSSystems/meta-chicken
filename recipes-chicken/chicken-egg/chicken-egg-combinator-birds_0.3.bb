SECTION = "devel/chicken"
DESCRIPTION = "Raymond Smullyan's combinator birds"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://combinator-birds.meta;md5=72798f78219e9a0de3146a4eb05ea3f7"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/combinator-birds/combinator-birds-${PV}.tar.gz"

SRC_URI[md5sum] = "e7dee94f0e04787a4dd2dbaddc518c02"
SRC_URI[sha256sum] = "10bd2aaf79b58369f7cd328bdc4ecc7e753546c2736eec7a564f3017c0063fcf"

S = "${WORKDIR}/combinator-birds-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
