package validAnagram

import (
	"reflect"
	"sort"
	"strings"
	"testing"
)

func TestValidAnagarm(t *testing.T) {
	a, b := "anagram", "nagaram"
	t.Log(IsAnagram(a, b))
}

func IsAnagram(s string, t string) bool {
	if len(s) != len(t) {
		return false
	}
	s1:=strings.Split(s,"")
	s2:=strings.Split(t,"")
    sort.Strings(s1)
	sort.Strings(s2)
	return reflect.DeepEqual(s1,s2)
}
