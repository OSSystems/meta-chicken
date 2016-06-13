SECTION = "devel/chicken"
DESCRIPTION = "barebones templating engine"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://templort.meta;md5=f182f2e08e9062e810d9a3167d84ed6f"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/templort/templort-${PV}.tar.gz"

SRC_URI[md5sum] = "4e4a91cc88e775999ff4a84a76033fe6"
SRC_URI[sha256sum] = "297c1fd0dd9b64d6fdb34787c0cde42a8f98a99898c1fb65ec23d530ae8a91cf"

S = "${WORKDIR}/templort-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
